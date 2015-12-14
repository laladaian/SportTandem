package main.java.unifr.tandem.dao;

import main.java.unifr.tandem.domain.User;
import main.java.unifr.tandem.domain.UserPref;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public class UserDao {

    private static Logger logger = Logger.getLogger(UserDao.class);

    protected JdbcTemplate jdbcTemplate = null;

    @Autowired
    public void setDataSource(@Qualifier("dataSource") final DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int getUserCount() {
        return this.jdbcTemplate.queryForInt("select count(0) from USER_PREFERENCES");
    }

    public User getUser(String username, String password) throws IncorrectResultSizeDataAccessException {
        User user = jdbcTemplate.queryForObject("select  username, realname, email from USER_PREFERENCES where username = ? AND password= ?",
                new Object[] { username, password },
                new RowMapper<User>() {

                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        User user = new User();
                        user.setUsername(rs.getString("username"));
                        user.setRealname(rs.getString("realname"));
                        user.setEmail(rs.getString("email"));
                        return user;
                    }
                });
        return user;
    }
    
    public boolean findUser(String username)  {
    	String sql = "select username from USER_PREFERENCES where username = '" + username+"'";
    	List<String> strLst = jdbcTemplate.query(sql,
                new RowMapper() {
					public Object mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						return rs.getString(1);
					}
                });

		if (strLst.isEmpty()) {
			return false;
		} else {
			return true;
		} 
    }

    public UserPref getUserPref(String username) {
        UserPref user = jdbcTemplate.queryForObject("select * " +
                "from USER_PREFERENCES where username = ?",
                new Object[] { username},
                new RowMapper<UserPref>() {

                    public UserPref mapRow(ResultSet rs, int rowNum) throws SQLException {
                        UserPref user = new UserPref();
                        user.setUsername(rs.getString("username"));
                        user.setRealname(rs.getString("realname"));
                        user.setEmail(rs.getString("email"));
                        user.setAge(rs.getInt("age"));
                        user.setFrequency(rs.getString("frequency"));
                        user.setCity(rs.getString("city"));
                        user.setSport(rs.getString("sport"));
                        user.setSportLevel(rs.getInt("sportLevel"));
                        return user;
                    }
                });
        return user;
    }

    public int addUser(User user) {

        logger.error("add user " + user.getUsername() + user.getRealname());

        try {
        	jdbcTemplate.update(
                    "insert into USER_PREFERENCES (username, password, realname, email) values (?, ?, ?, ?)",
                    user.getUsername(), user.getPassword(), user.getRealname(), user.getEmail());
        	return 1;
        } catch (Exception e) {
        	return 0;
        }

    }

    public void addUserPref(UserPref userPref) {
        jdbcTemplate.update(
                "update USER_PREFERENCES set sport = ?, sportLevel = ?, city = ?, sex = ?, age = ?, " +
                        "frequency = ?, comments = ? " + "where username = ?",
                userPref.getSport(), userPref.getSportLevel(), userPref.getCity(), userPref.getSex(),
                userPref.getAge(), userPref.getFrequency(), userPref.getComments(),
                userPref.getUsername());
    }

    public boolean hasUserPref(String username) {
        int number = jdbcTemplate.queryForInt(
                "select COUNT(sport) from USER_PREFERENCES where username = ?", username);
        return number > 0;
    }

    public List<UserPref> getSportPartners(UserPref userPref) {
        List<UserPref> users = new ArrayList<UserPref>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(
                "select username, realname, email, comments, phone from USER_PREFERENCES " +
                "where sport = ? and city = ? and frequency = ? " +
                "and sportLevel between ? and ? and age between ? and ? and username <> ?",
                userPref.getSport(), userPref.getCity(), userPref.getFrequency(), userPref.getSportLevel() - 1,
                userPref.getSportLevel() + 1, userPref.getAge() - 3, userPref.getAge() + 3, userPref.getUsername());
        for(Map row : rows) {
            UserPref user = new UserPref();
            user.setUsername((String)row.get("username"));
            user.setRealname((String) row.get("realname"));
            user.setEmail((String) row.get("email"));
            user.setPhone((String)row.get("phone"));
            user.setComments((String)row.get("comments"));
            users.add(user);
        }
        return users;
    }
}
