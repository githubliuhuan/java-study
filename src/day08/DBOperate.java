//package day8;
///*
//需求：数据库的操作
//1.连接数据库
//2.操作数据库
//  i d u r
//3.关闭数据库连接
// */
//
//
//interface UserInfoDao
//{
//    public void add(User user);
//    public void delete(User user);
//
//}
//
//class UserInfoByJDBC implements UserInfoDao
//{
//    public void add(User user)
//    {
//        1.JDBC连接数据库;
//        2.使用sql语句添加数据;
//        3.关闭连接;
//    }
//    public void delete(User user)
//    {
//        1.JDBC连接数据库;
//        2.使用sql语句删除数据;
//        3.关闭连接;
//    }
//}
//
//
//class UserInfoByHibernate implements UserInfoDao
//{
//    public void add(User user)
//    {
//        1.hibernate连接数据库;
//        2.使用sql语句添加数据;
//        3.关闭连接;
//    }
//    public void delete(User user)
//    {
//        1.hibernate连接数据库;
//        2.使用sql语句删除数据;
//        3.关闭连接;
//    }
//}
//
//
//public class DBOperate {
//    public static void main(String[] args) {
//        UserInfoDao ui = new UserInfoByJDBC();
//        ui.add(user);
//        ui.delete(user);
//    }
//}
