package com.nishasoni.restdemo.controller;

import com.nishasoni.restdemo.model.Vender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vender")
public class VenderController {

    Vender vender;
    @GetMapping("{venderId}")
    public Vender getVendorDetails(String venderId){

      //  return new Vender("C1","vender 1","Address One","xxxxx");
   return vender;
    }
    @PostMapping
    public String createVenderDetails(@RequestBody Vender vender){
        this.vender = vender;
        return "Vender created Succussfully";
    }

    @PutMapping
    public String updateVenderDetails(@RequestBody Vender vender){
        this.vender = vender;
        return "Vender updated Succussfully";
    }

    @DeleteMapping("{venderId}")
    public String deleteVenderDetails(String venderId){
        this.vender = null;
        return "Vender Deleted Succussfully";
    }

}
