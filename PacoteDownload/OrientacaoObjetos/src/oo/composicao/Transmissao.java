/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;
import java.lang.Math;
/**
 *
 * @author ADAILTON
 */
public class Transmissao {
    
    double [] marchas = {0, 0.01, 0.03, 0.06, 0.10, 0.15};
 //   double relacaoMarchaMotor;
 //   double relacaoMarchaRoda;
//    double relacaoMotorRoda;
//    final double constVel = 3.6;
    
    
   void marchaNeutro() {
       
   }
           
  double marchaPrimeira(double giroMotor) {
  //    marchas[1] = 0.25;
      return (giroMotor*marchas[1]);
  }
  double marchaSegunda(double giroMotor) {
  //   marchas[2] = 0.35;
      return (giroMotor*marchas[2]);
  }
  double marchaTerceira(double giroMotor) {
      return (giroMotor*marchas[3]);
  }
  double marchaQuarta (double giroMotor) {
      return (giroMotor*marchas[4]);
  }
  double marchaQuinta (double giroMotor) {
      return (giroMotor*marchas[5]);
  }
  
  
}
