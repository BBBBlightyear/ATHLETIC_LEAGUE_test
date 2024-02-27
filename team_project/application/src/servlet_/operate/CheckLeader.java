package servlet_.operate;

import druid_JDBC_utils.Druid_Utils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/checkLeader")
public class CheckLeader extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        String Student_ID_Leader=(String)session.getAttribute("Student_ID");
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            connection= Druid_Utils.getConnection();
            String sql="select * from link_team.team_table where Student_ID_Leader= ?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,Student_ID_Leader);
            resultSet= preparedStatement.executeQuery();
            if(! resultSet.next()) {
                resp.getWriter().print("<script>window.location.href='http://localhost:8080/_war_exploded/createTeam.jsp'</script>");
            }
            else{
                resp.getWriter().print("<script>alert('您已经创建过队伍，无法再次创建！');"+
                        "window.location.href='http://localhost:8080/_war_exploded/home_page.jsp'</script>");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            Druid_Utils.close(resultSet,preparedStatement,connection);
        }
    }
}
