<%--
  Created by IntelliJ IDEA.
  User: ricardoayala
  Date: 3/13/23
  Time: 9:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <label for="crust">
        Select your Crust
    </label>
        <select name="crust" id="crust">
        <option value="blank" hidden selected></option>
        <option value="thin-crust">Thin Crust</option>
        <option value="hand-tossed">Hand Tossed</option>
        <option value="deep-dish">Deep Dish</option>
    </select>
    <br>
    <select name="size" id="size">
        <option value="blank" hidden selected>Choose Your Size</option>
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <br>
    <label for="sauce"></label>
    <select name="sauce" id="sauce">
        <option value="blank" hidden selected>Choose Your Sauce</option>
        <option value="marinara">Marinara</option>
        <option value="bbq">BBQ</option>
        <option value="alfredo">Alfredo</option>
    </select>
    <br>
    <label for="cheese">How Cheesy Should it be?</label>
    <select name="cheese" id="cheese">
        <option value="blank" hidden selected></option>
        <option value="light-cheese">just a little cheesy</option>
        <option value="normal-cheese">just the right amount</option>
        <option value="extra-cheese">As Cheesy as Dad Jokes</option>
    </select>
    <br>
    <div> Choose your toppings
        <input type="checkbox" id="pepperoni" value="pepperoni">
    <label for="pepperoni">Pepperoni</label>
        <input type="checkbox" id="ham" value="ham">
        <label for="ham">Ham</label>
        <input type="checkbox" id="bacon" value="bacon">
        <label for="bacon">Bacon</label>
        <input type="checkbox" id="mushroom" value="mushroom">
        <label for="mushroom">Mushroom</label>
        <input type="checkbox" id="green-pepper" value="green-pepper">
        <label for="green-pepper">Green Pepper</label>
        <input type="checkbox" id="onion" value="onion">
        <label for="onion">Onion</label>
    </div>
    <br>
    <label for="address">Where's this Pizza going?</label>
    <input type="text" id="address">

    <button>Make Your Pizza</button>
</form>
</body>
</html>
