package org.fer.pooclasesabstractas.form.elementos;

public class inputForm extends ElementoForm{
    private String tipo = "Text";

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public inputForm(String nombre) {
        super(nombre);
    }

    public inputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        return "<input type=\"" + this.tipo
                + "\" name= \"" + this.nombre
                + "\" value=\""+ this.valor+ "\">";
    }
}
