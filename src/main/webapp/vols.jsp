<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<%@ page import="metier.vol" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Fly - Luxury Jet Flights</title>
  <meta name="title" content="Fly - Luxury Jet Flights">
  <meta name="description" content="Private flight HTML template made by codewithsadee">
  <link rel="shortcut icon" href="./favicon.svg" type="image/svg+xml">
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;700&family=Ubuntu:wght@300;400;700&display=swap" rel="stylesheet">
  <style>
    body, html {
      margin: 0;
      padding: 0;
      height: 100%;
      font-family: 'Montserrat', sans-serif;
    }
    .hero {
      background-image: url('https://images.unsplash.com/photo-1507525428034-b723cf961d3e');
      background-size: cover;
      color: #fff;
      text-align: center;
      padding: 15% 0 10% 0;
    }
    form {
      background: none;
      padding: 20px;
      margin: 20px auto;
    }
    input[type="text"], input[type="date"], input[type="number"] {
      padding: 15px;
      margin: 10px 0;
      border-radius: 50px;
      border: 2px solid #fff;
      background-color: rgba(255, 255, 255, 0.7);
      transition: all 0.3s ease;
    }
    input[type="text"]:focus, input[type="date"]:focus, input[type="number"]:focus {
      background-color: #fff;
      box-shadow: 0 0 0 2px #dfd2c7d9;
    }
    button {
      cursor: pointer;
      background-color: #ff6f61;
      color: #fff;
      padding: 15px 30px;
      font-size: 16px;
      font-family: 'Ubuntu', sans-serif;
      font-weight: bold;
      border: none;
      border-radius: 50px;
      transition: all 0.3s ease;
    }
    button:hover {
      background-color: #e05750;
    }
    h1 {
      font-size: 48px;
      font-weight: 300;
      margin-bottom: 20px;
      font-family: 'Ubuntu', sans-serif;
    }
    h2 {
      font-weight: 400;
    }
    #results {
      padding: 20px;
      max-width: 800px;
      margin: 20px auto;
    }
    .abs-img {
      position: absolute;
      top: 0;
      left: 50%;
      transform: translate(-50%, -1%);
      width: 40%;
      height: auto;
      max-width: 1000px;
      opacity: 0.8;
      animation: flyMove 1.4s ease-in-out infinite alternate;

    }
    
@keyframes flyMove {
  0% { transform: translate(-50%, 20%); }
  100% { transform: translate(-50%, 23%); }
}

    .container {
      position: relative;
    }
    
  </style>
</head>

<body id="top">
  <main>
  <%
    List<vol> vols = (List<vol>) request.getAttribute("vols");
    for (vol v : vols) {
        out.println(v.getNom());
    }
%>
    <img src="./assets/images/hero-banner.png" class="abs-img">
    <section class="section hero" id="home" aria-label="home">
      <div class="container">
        <h1>Recherche de Vols</h1>
        <form action="/siege.html" id="search-form">
            <input type="text" id="departure" placeholder="Ville de départ">
            <input type="text" id="destination" placeholder="Destination">
            <input type="date" id="departure-date" placeholder="Date de départ">
            <input type="date" id="return-date" placeholder="Date de retour">
            <input type="number" id="passengers" placeholder="Nombre de passagers" min="1" max="30">
            <button type="submit">Rechercher</button>
        </form>
        <h2>Résultats</h2>
        <div id="results"></div>
      </div>
    </section>
  </main>
  <script src="./assets/js/script.js" defer></script>
  <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
  <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

</body>

</html>