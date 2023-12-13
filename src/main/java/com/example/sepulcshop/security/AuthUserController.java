package com.example.sepulcshop.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthUserController {


    private final SepulcstoreUserRegister userRegister;

    @Autowired
    public AuthUserController(SepulcstoreUserRegister userRegister) {
        this.userRegister = userRegister;
    }

    @GetMapping("/signin")
    public String handleSingIn(){
        return "signin";
    }

    @GetMapping("/signup")
    public String handleSingUp(Model model)
    {
        model.addAttribute("regForm",new RegistrationForm());
        return "signup";
    }


    @PostMapping("/requestContactConfirmation")
    @ResponseBody
    public ContactConfirmationResponse handleRequestContactConfirmation(@RequestBody ContactConfirmationPayload payload)
    {
        ContactConfirmationResponse response =new ContactConfirmationResponse();
        response.setResult(true);

        return response;
    }


    @PostMapping("/approveContact")
    @ResponseBody
    public ContactConfirmationResponse handleApproveContact (@RequestBody ContactConfirmationPayload payload)
    {
        ContactConfirmationResponse response =new ContactConfirmationResponse();
        response.setResult(true);

        return response;
    }

    @PostMapping("/reg")
    public String handleUserRegistration(RegistrationForm registrationForm, Model model)
    {
        userRegister.registerNewUser(registrationForm);

        model.addAttribute("regOk",true);
        return "signin";
    }

}
