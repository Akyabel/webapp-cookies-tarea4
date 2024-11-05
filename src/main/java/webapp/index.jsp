<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cookies</title>
</head>
<body>
<h3 style="color:${cookie.color.getValue()}" >Tarea 4; cambiar el color de los textos</h3>
<p> Este es un texto que cambia de color </p>
<form action="/webapp-cookies-tarea4/cambiar-color" method="get">
    <select name="color" id="color">
        <option value="blue">Azul</option>
        <option value="red">Rojo</option>
        <option value="green">Verde</option>
        <option value="aqua">Aqua</option>
        <option value="BlueViolet">Violeta</option>
        <option value="Gray">Gris</option>
        <option value="Cyan">Cyan</option>
    </select>
    <div>
        <button type="submit">Cambiar color</button>
    </div>
</form>
</body>
</html>