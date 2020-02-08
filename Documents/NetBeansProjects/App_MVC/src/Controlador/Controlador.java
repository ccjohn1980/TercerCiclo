package Controlador;

import Modelo.Modelo_Clase;
import Vista.Vista_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
   
    private Vista_1 view;
    private Modelo_Clase model;
    
    public Controlador(Vista_1 view, Modelo_Clase model)
    {
        this.view = view;
        this.model = model;
        this.view.btnmultiplicar.addActionListener(this);
    }        
    
    public void iniciar()
    {
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNun1(Integer.parseInt(view.txtnum1.getText()));
        model.setNum2(Integer.parseInt(view.txtnum2.getText())); 
        model.multiplicar();
        view.txtresultado.setText(String.valueOf(model.getResultado()));
    }
}