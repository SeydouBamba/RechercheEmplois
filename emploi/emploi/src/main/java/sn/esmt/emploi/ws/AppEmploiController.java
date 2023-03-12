package sn.esmt.emploi.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.emploi.doa.AppEmploiRepository;
import sn.esmt.emploi.entities.AppEmploiEntity;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@AllArgsConstructor
public class AppEmploiController {
    private AppEmploiRepository appEmploiRepository;
     @PostMapping(path = "/save")
    public AppEmploiEntity save(@RequestBody AppEmploiEntity appEmploiEntity){
         return appEmploiRepository.save(appEmploiEntity);
     }

     @GetMapping(path = "/all")
    public List<AppEmploiEntity> getAll(){

         return appEmploiRepository.findAll();
     }

     @GetMapping(path = "/login")
     //Cette méthode prend un seul paramètres email ,
     // qui sont extraits de la requête HTTP en utilisant l'annotation @RequestParam
    public ApiLoginResponse login(@RequestParam String email){

         //appelle la méthode "findByEmail" de la classe "AppEmploiRepository" pour trouver l'utilisateur
         // ayant l'adresse e-mail  correspondant aux paramètres de requête "email" et "password".
         AppEmploiEntity appEmploiEntity = appEmploiRepository.findByEmail(email);
         if(appEmploiEntity != null){
             //signifie qu'un utilisateur correspondant aux informations d'identification a été trouvé.
             //une connexion réussie et l'adresse e-mail de l'utilisateur.
             return new ApiLoginResponse("OK",email);
         }else{
             return new ApiLoginResponse("NOK",email);
         }

     }


}
