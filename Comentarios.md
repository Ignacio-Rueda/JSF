-Para enviar información al servidor usar: h:form  

-La diferencia entre "action" y "actionListener":   

    action: El método me devuelve un valor String y ese valor String, necesita ser interpretado para una regla de navegación: llevar a otra página web.  

    actionListener: Ejecuta el método.  

-h:panelgrid: Me permite ordenar de manera muy dinámica los componentes que voy a mostra en la web.  

    columns: Indica el número de columnas que tendrá el panel.  

-h:dataTable: Necesita una lista para poder mostrar todos los elementos.
Presenta una propiedad llamada: "var" El var es un alias que le ponemos al componente para poder entrar a la lista que este contiene.
-f:facet: Para agregar un encabezado  

JSF es muy práctico en cuanto a la renderización, permite establecer si un componente va a estar cargado para el usuario. Gracias al atributo rendered.     

Para validar campos:  
1-Directamente en el xhtml, por ejemplo: para el caso de números: validateLongRange.  
2-BackendBeans o clases de respaldo. Son clases manejadas por JSF. 
3-Interfaz Validator. 

immediate="true". Por lo general se usa para botones de tipo cancelar o retroceder.