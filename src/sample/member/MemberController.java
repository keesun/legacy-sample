package sample.member;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sample.domain.Member;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired MemberService memberService;
	
	@RequestMapping("/list")
	public void list(Model model){
		model.addAttribute("list", memberService.list());
	}
	
	@RequestMapping("/form")
	public void form(Model model){
		model.addAttribute("member", new Member());
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String formSubmit(@Valid Member member, BindingResult result){
		if(result.hasErrors())
			return "member/form";
		memberService.add(member);
		return "redirect:/app/member/list";
	}
	
}
