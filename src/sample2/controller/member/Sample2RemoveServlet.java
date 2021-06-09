package sample2.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sample2.bean.Member;
import sample2.service.member.MemberRemoveService;


/**
 * Servlet implementation class Sample2RemoveServlet
 */
@WebServlet("/sample2/member/remove")
public class Sample2RemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//필드로 선언
	private MemberRemoveService service = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample2RemoveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	
    	service = new MemberRemoveService();
		
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("userLogined");
		
		this.service.remove(member.getId()); // 서비스한테 일시키기
		
		
		session.invalidate();
		
		String path = request.getContextPath() + "/sample2/member/main";
		response.sendRedirect(path);
	}

}









