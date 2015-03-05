package com.sa.controller;
import java.util.ArrayList;
import java.util.List;

import com.sa.command.RegisterCommand;
import com.sa.service.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;



public class RegisterController extends SimpleFormController{
	private RegisterService registerService;
	
		public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}



		protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		// TODO Auto-generated method stub
			ModelAndView mav=null;
			RegisterCommand registerCommand=(RegisterCommand)command;
			System.out.println("Second Name"+registerCommand.getSecondName());
			System.out.println("Email is"+registerCommand.getEmail());
			registerService.insert(registerCommand);
			mav=new ModelAndView();
			mav.setViewName("success");
			return mav;
		}
		
		/**
		 	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String displayForm() {
		return "file_upload_form";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(
			@ModelAttribute("uploadForm") FileUploadForm uploadForm,
					Model map) {
		
		List<MultipartFile> files = uploadForm.getFiles();

		List<String> fileNames = new ArrayList<String>();
		
		if(null != files && files.size() > 0) {
			for (MultipartFile multipartFile : files) {

				String fileName = multipartFile.getOriginalFilename();
				fileNames.add(fileName);
				//Handle file content - multipartFile.getInputStream()

			}
		}
		
		map.addAttribute("files", fileNames);
		return "file_upload_success";
	}

		**/
		
}
