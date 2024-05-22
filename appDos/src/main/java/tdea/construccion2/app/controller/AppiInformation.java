package tdea.construccion2.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class AppiInformation {
    
   @GetMapping("/info")
   public ResponseEntity<AppInfo> getInfo(){
       AppInfo appInfo = new AppInfo();
       appInfo.setNombreAplicativo("Api Vet");
       appInfo.setDesarrollador("Valeria and Hazly");
       appInfo.setEstado("En funcionamiento");
       return ResponseEntity.ok().body(appInfo);
       
   }
}
