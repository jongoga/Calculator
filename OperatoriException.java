 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Jon
 */
public class OperatoriException extends Exception {
    
    public OperatoriException(String op){
        super(op+ "nuk perkrahet!");
    }
}
