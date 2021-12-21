/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2_Web.Reto_Web.interfaces;

import Reto2_Web.Reto_Web.modelo.Cookware;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 *
 * @author braya
 */
public interface CookwareInterface extends MongoRepository<Cookware, String>{

}
