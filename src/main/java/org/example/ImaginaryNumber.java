package org.example;

import javax.swing.JOptionPane;

public class ImaginaryNumber {
    private static final String SQUARE_ROOT_OF_ONE = "SQRT(1)";
    private static final String UNO = "1";
    private static final String MINUS_I = "-i";
    private static final String MINUS_ONE = "-1";

    public String resultPowerImaginaryNumber(int number){
        if(number == 1){
            return SQUARE_ROOT_OF_ONE;
        }else if(number == 0 || number % 4 == 0){
            return UNO;
        }
        return number % 2 != 0 ? MINUS_I : MINUS_ONE;
    }

    public void inputAndOutputOfResults(){
        boolean isNumber;
        int numberPower=0;
        do{
            isNumber = true;
            try{
                numberPower = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita la potencia de i"));
            }catch (NumberFormatException e){
                isNumber = false;
                JOptionPane.showMessageDialog(null,"Solo se aceptan numeros");
            }
        }while (!isNumber);

        JOptionPane.showMessageDialog(null,"El resultado de la potencia de i^"+ numberPower +
                " es: " + resultPowerImaginaryNumber(numberPower));
    }

    public static void main(String[] args) {
        ImaginaryNumber imaginaryNumber = new ImaginaryNumber();
        imaginaryNumber.inputAndOutputOfResults();
    }
}