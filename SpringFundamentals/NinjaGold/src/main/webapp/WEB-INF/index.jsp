<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Index</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script src="js/main.js"></script>
    </head>

    <body>
        <form class="activity" action="/process" method="POST">
            <h2>Farm</h2>
            <p>(Earns 10-20 gold)</p>
            <input type="submit" name="farm" value="Find Gold!" />
        </form>
        <form class="activity" action="/process" method="POST">
            <h2>Cave</h2>
            <p>(Earns 5-10 gold)</p>
            <input type="submit" name="farm" value="Find Gold!" />
        </form>
        <form class="activity" action="/process" method="POST">
            <h2>House</h2>
            <p>(Earns 2-5 gold)</p>
            <input type="submit" name="farm" value="Find Gold!" />
        </form>
        <form class="activity" action="/process" method="POST">
            <h2>Casino</h2>
            <p>(Earns/Takes
                <br> 0-50 gold)</p>
            <input type="submit" name="farm" value="Find Gold!" />
        </form>

    </body>

    </html>

