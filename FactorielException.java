package calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jon
 */
public class FactorielException extends Exception{
    public FactorielException(int x){
        super("Nuk ka faktoriel te numrit negativ "+x);
    }
}
