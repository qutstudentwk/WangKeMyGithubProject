import java.sql.*;

public class Test {
    public static Connection getConnection(){
        String driver="com.mysql.jdbc.Driver";   //获取mysql数据库的驱动类
        String url="jdbc:mysql://localhost:3306/db_research?useUnicode=true&characterEncoding=utf8"; //连接数据库（test是数据库名）
        String name="root";//连接mysql的用户名
        String pwd="admin";//连接mysql的密码
        Connection conn= null;
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e1) {
            System.out.println("驱动加载失败");
            e1.printStackTrace();
        }
        try{
            conn= DriverManager.getConnection(url,name,pwd);//获取连接对象
            System.out.println("成功连接数据库！");
            return conn;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }finally {
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void closeAll(Connection conn, PreparedStatement ps, ResultSet rs){
        try{
            if(rs!=null){
                rs.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        try{
            if(ps!=null){
                ps.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        try{
            if(conn!=null){
                conn.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException
    {

        Connection cc=Test.getConnection();
    }
}
