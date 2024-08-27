package org.fer.pooclasesabstractas.form;

import org.fer.pooclasesabstractas.form.elementos.ElementoForm;
import org.fer.pooclasesabstractas.form.elementos.SelectForm;
import org.fer.pooclasesabstractas.form.elementos.TextAreaForm;
import org.fer.pooclasesabstractas.form.elementos.inputForm;
import org.fer.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        inputForm username = new inputForm("username");
        inputForm password = new inputForm("clave", "password");
        inputForm email = new inputForm("email", "email");
        inputForm edad = new inputForm("edad", "number");

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);
        SelectForm lenguaje = new SelectForm("Lenguaje");
        Opcion java = new Opcion("1", "java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2", "python"));
        lenguaje.addOpcion(new Opcion("3", "JavasCript"));
        lenguaje.addOpcion(new Opcion("4", "TypeScript"));
        lenguaje.addOpcion(new Opcion("5", "PHP"));

        username.setValor("john doe");
        password.setValor("a1c2b3");
        email.setValor("email@gmail.com");
        edad.setValor("28");
        experiencia.setValor("........ mas 10 años de experiencia ...........");
        java.setSelected(true);

        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        for (ElementoForm elementoForm : elementos){
            System.out.println(elementoForm.dibujarHtml());
            System.out.println("<br>");
        }

    }
}
