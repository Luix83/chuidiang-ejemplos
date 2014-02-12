package com.chuidiang.ejemplos.html_unit;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

/**
 * Ejemplo tonto con HTML Unit para ver c�mo se ejecuta el c�digo javascript de la p�gina
 * y c�mo puede ejecutarse a posteriori m�s c�digo javascript sobre la p�gina.
 * 
 * Necesitas todas las librer�as que vienen con HTMLUnit.
 * 
 * @author Chuidiang
 */
public class JavascriptWithHtmlUnit {

   public static void main(String[] args) throws Exception {
      WebClient webClient = new WebClient();
      HtmlPage page = webClient.getPage("file:resources/JavascriptWithHtmlUnit.html");
      
      // Sale "hola", puesto que se ha ejecutado el codigo javascript de la pagina
      System.out.println(page.getElementById("unDiv").getTextContent());
      
      // Cambiamos el contenido usando funciones est�ndar de javascript en navegador
      page.executeJavaScript("document.getElementById(\"unDiv\").innerHTML=\"que tal?\"");
      System.out.println(page.getElementById("unDiv").getTextContent());
      
      // Cambiamos el contenido con una funcion javascript definida en la pagina.
      page.executeJavaScript("cambia(\"adios\")");
      System.out.println(page.getElementById("unDiv").getTextContent());
   }
}
