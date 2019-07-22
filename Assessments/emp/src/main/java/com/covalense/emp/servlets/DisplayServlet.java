package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;
import com.covalense.emp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
@WebServlet("/display")
public class DisplayServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		// validate the session
		HttpSession session = req.getSession(false);
		if (session == null) {
			out.print("<h1><span style='color:red'>Invaled session!! pls login!!</span></h1>");
			out.print("<br><br>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		} else {

			String idValue = req.getParameter("eid");

			EmployeeInfoBean bean = searchEmployee(idValue);
			resp.setContentType("text/html");

			if (bean == null) {

				out.print("<!DOCTYPE html>");
				out.print("<html>");
				out.print("<head>");
				out.print("<meta charset=\"ISO-8859-1\">");
				out.print("<title>My Servlet Response</title>");
				out.print("</head>");
				out.print("<body>");
				out.print("<h6 class=\"text-center\">");
				out.print("<span style=\"color:red\">");
				out.print("Unable to retrieve from DB");
				out.print("</span>");
				out.print("</h6>");
				out.print("</body>");
				out.print("</html>");

				RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
				dispatcher.include(req, resp);

			} else {
				out.println(
						"						<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'>                                                                           ");
				out.println(
						"						<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js'></script>                                                                                    ");
				out.println(
						"						<!-- <script src='//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script> -->                                                                                   ");
				out.println(
						"						<link rel='stylesheet' href='./profile.css' >                                                                                                                                  ");
				out.println(
						"						<!------ Include the above in your HEAD tag ---------->                                                                                                                        ");
				out.println(
						"						<style>                                                                                                                                                                        ");
				out.println(
						"								img {                                                                                                                                                                  ");
				out.println(
						"								  border-radius: 50%;                                                                                                                                                  ");
				out.println(
						"								  width: 100px;                                                                                                                                                        ");
				out.println(
						"								  height: 100px;                                                                                                                                                       ");
				out.println(
						"								}                                                                                                                                                                      ");
				out.println(
						"						</style>                                                                                                                                                                       ");
				out.println(
						"						<div class='container emp-profile'>                                                                                                                                            ");
				out.print("<form action=\"./empSearch\" method=\"get\">");
				out.print("<span style=\"color:blue\">Search Employee Id : </span><input type=\"text\" name=\"eid\"/>");
				out.print("<input type=\"submit\" value=\"Search\"/></form>");
				out.print(
						"												</div>                                                                                                                                                 ");
				out.println(
						"						<div class='container emp-profile'>                                                                                                                                            ");
				out.println(
						"									<form method='post'>                                                                                                                                               ");
				out.println(
						"										<div class='row'>                                                                                                                                              ");
				out.println(
						"											<div class='col-md-4'>                                                                                                                                     ");
				out.println(
						"											</div>                                                                                                                                                     ");
				out.println(
						"											<div class='col-md-7'>                                                                                                                                     ");
				out.println(
						"												<div class='wrap'>                                                                                                                                     ");
				out.print(
						"												</div>                                                                                                                                                 ");
				out.println(
						"											</div>                                                                                                                                                     ");
				out.println(
						"											<div class='col-md-1'>                                                                                                                                     ");
				out.println(
						"													<a href='./logout'>Logout</a>                                                                                                                  ");
				out.println(
						"											</div>                                                                                                                                                     ");
				out.println(
						"											<br/><br/>                                                                                                                                                 ");
				out.println(
						"											<div class='col-md-4'>                                                                                                                                     ");
				out.println(
						"													<img src='image001.jpg' alt='Avatar' style='width:100px;'>                                                                                       ");
				out.println(
						"												<!-- <div class='profile-img'>                                                                                                                         ");
				out.println(
						"													<div class='file btn btn-lg btn-primary'>                                                                                                          ");
				out.println(
						"														Change Photo                                                                                                                                   ");
				out.println(
						"														<input type='file' name='file'/>                                                                                                               ");
				out.println(
						"													</div>                                                                                                                                             ");
				out.println(
						"												</div> -->                                                                                                                                             ");
				out.println(
						"											</div>                                                                                                                                                     ");
				out.println(
						"											<div class='col-md-6'>                                                                                                                                     ");
				out.println(
						"												<div class='profile-head'>                                                                                                                             ");
				out.println(
						"															<h5>                                                                                                                                       ");
				out.println(bean.getName().toUpperCase());
				out.println(
						"															</h5>                                                                                                                                      ");
				out.println(
						"															<h6>                                                                                                                                       ");
				out.println(bean.getDesignation().toUpperCase());
				out.println(
						"															</h6>                                                                                                                                      ");
				out.println(
						"													<ul class='nav nav-tabs' id='myTab' role='tablist'>                                                                                                ");
				out.println(
						"														<li class='nav-item'>                                                                                                                          ");
				out.println(
						"															<a class='nav-link active' id='home-tab' data-toggle='tab' href='#home' role='tab' aria-controls='home' aria-selected='true'>About</a>     ");
				out.println(
						"														</li>                                                                                                                                          ");
				out.println(
						"													</ul>                                                                                                                                              ");
				out.println(
						"												</div>                                                                                                                                                 ");
				out.println(
						"											</div>                                                                                                                                                     ");
				out.println(
						"											<div class='col-md-2'>                                                                                                                                     ");
				out.println(
						"												<input type='submit' class='profile-edit-btn' name='btnAddMore' value='Edit'/>&nbsp;&nbsp;                                                             ");
				out.println(
						"											</div>                                                                                                                                                     ");
				out.println(
						"										</div>                                                                                                                                                         ");
				out.println(
						"										<div class='row'>                                                                                                                                              ");
				out.println(
						"											<div class='col-md-4'>                                                                                                                                     ");
				out.println(
						"												<div class='profile-work'>                                                                                                                             ");
				out.println(
						"												</div>                                                                                                                                                 ");
				out.println(
						"											</div>                                                                                                                                                     ");
				out.println(
						"											<div class='col-md-8'>                                                                                                                                     ");
				out.println(
						"												<div class='tab-content profile-tab' id='myTabContent'>                                                                                                ");
				out.println(
						"													<div class='tab-pane fade show active' id='home' role='tabpanel' aria-labelledby='home-tab'>                                                       ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println(
						"																		<label>User Id</label>                                                                                                         ");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println(bean.getId());
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																</div>                                                                                                                                 ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println(
						"																		<label>Name</label>                                                                                                            ");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println("<p>" + bean.getName().toUpperCase() + "</p>");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																</div>                                                                                                                                 ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																		<div class='col-md-6'>                                                                                                         ");
				out.println(
						"																			<label>Age</label>                                                                                                         ");
				out.println(
						"																		</div>                                                                                                                         ");
				out.println(
						"																		<div class='col-md-6'>                                                                                                         ");
				out.println("<p>" + bean.getAge() + "</p>");
				out.println(
						"																		</div>                                                                                                                         ");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println(
						"																		<label>Email</label>                                                                                                           ");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println("<p>" + bean.getEmail() + "</p>");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																</div>                                                                                                                                 ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println(
						"																		<label>Phone</label>                                                                                                           ");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println("<p>" + bean.getPhone() + "</p>");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																</div>                                                                                                                                 ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																		<div class='col-md-6'>                                                                                                         ");
				out.println(
						"																			<label>Joining Date</label>                                                                                                ");
				out.println(
						"																		</div>                                                                                                                         ");
				out.println(
						"																		<div class='col-md-6'>                                                                                                         ");
				out.println("<p>" + bean.getJoiningDate() + "</p>");
				out.println(
						"																		</div>                                                                                                                         ");
				out.println(
						"																</div>                                                                                                                                 ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																		<div class='col-md-6'>                                                                                                         ");
				out.println(
						"																			<label>Designation</label>                                                                                                 ");
				out.println(
						"																		</div>                                                                                                                         ");
				out.println(
						"																		<div class='col-md-6'>                                                                                                         ");
				out.println("<p>" + bean.getDesignation() + "</p>");
				out.println(
						"																		</div>                                                                                                                         ");
				out.println(
						"																</div>                                                                                                                                 ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																		<div class='col-md-6'>                                                                                                         ");
				out.println(
						"																			<label>Account Number</label>                                                                                              ");
				out.println(
						"																		</div>                                                                                                                         ");
				out.println(
						"																		<div class='col-md-6'>                                                                                                         ");
				out.println("<p>" + bean.getAccountNo() + "</p>");
				out.println(
						"																		</div>                                                                                                                         ");
				out.println(
						"																</div>                                                                                                                                 ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println(
						"																		<label>Gender</label>                                                                                                          ");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println("<p>" + bean.getGender() + "</p>");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																</div>                                                                                                                                 ");
				// out.println(" </div> ");
				// out.println(" <div class='tab-pane fade' id='profile' role='tabpanel'
				// aria-labelledby='profile-tab'> ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println(
						"																		<label>Department</label>                                                                                                      ");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println("<p>" + bean.getDepartmentId() + "</p>");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																</div>                                                                                                                                 ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println(
						"																		<label>Salary</label>                                                                                                     ");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println("<p>" + bean.getSalary() + "</p>");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																</div>                                                                                                                                 ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println(
						"																		<label>Date of Birth</label>                                                                                                  ");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println("<p>" + bean.getDob() + "</p>");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																</div>                                                                                                                                 ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println(
						"																		<label>Manager Id</label>                                                                                                   ");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println("<p>" + bean.getManagerId() + "</p>");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																</div>                                                                                                                                 ");
				out.println(
						"																<div class='row'>                                                                                                                      ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println(
						"																		<label>Availability</label>                                                                                                    ");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																	<div class='col-md-6'>                                                                                                             ");
				out.println(
						"																		<p>6 months</p>                                                                                                                ");
				out.println(
						"																	</div>                                                                                                                             ");
				out.println(
						"																</div>                                                                                                                                 ");
				out.println(
						"														<div class='row'>                                                                                                                              ");
				out.println(
						"															<div class='col-md-12'>                                                                                                                    ");
				out.println(
						"															</div>                                                                                                                                     ");
				out.println(
						"														</div>                                                                                                                                         ");
				out.println(
						"													</div>                                                                                                                                             ");
				out.println(
						"												</div>                                                                                                                                                 ");
				out.println(
						"											</div>                                                                                                                                                     ");
				out.println(
						"										</div>                                                                                                                                                         ");
				out.println(
						"									</form>                                                                                                                                                            ");
				out.println(
						"								</div>                                                                                                                                                                 ");
			}

		}
	}

	private EmployeeInfoBean searchEmployee(String id) {

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);

		return bean;
	}

}
