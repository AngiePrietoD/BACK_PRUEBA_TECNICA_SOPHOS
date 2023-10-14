package com.example.BackPrueba.controllers;
import com.example.BackPrueba.models.dto.LoginDTO;
import com.example.BackPrueba.models.dto.PersonDTO;
import com.example.BackPrueba.models.dto.UserDTO;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Login")
@CrossOrigin("*")
public class LoginController {
    @PostMapping("")
    public UserDTO login(@RequestBody LoginDTO login) {
        UserDTO user = new UserDTO();
            if (login.getTypeDocument().equals("C") && login.getDocument().equals(23445322) ) {
                PersonDTO person = dataPerson ();
                user.setCodeResponse(1);
                user.setMessage("Los datos son correctos");
                user.setPERSONA(person);
                return user;
            } else {
                user.setCodeResponse(2);
                user.setMessage("Los datos son incorrectos");
                user.setPERSONA(null);
            }
            return user;
    }

    public PersonDTO dataPerson (){
        PersonDTO person = new PersonDTO();
        person.setFirstName("Angie");
        person.setSecondName("Lorena");
        person.setSurname("Prieto");
        person.setSecondSurname("Dominguez");
        person.setPhone(3202349004L);
        person.setAddress("Carrera 10 # 45-76");
        person.setResidence("Bogota D.C");
        return person;
    }
}
