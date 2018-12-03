<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>REGISTER.JSP</title>
</head>

<body>

	<h1>ADMIN/SP REGISTRATION PAGE</h1>
	
	<form action="Register" method="POST">
		Username:
		<input type="text" name="username" placeholder="Username" required><br>
		Password:
		<input type="password" name="password" placeholder="Password" required><br>
		Email:
		<input type="email" name="email" placeholder="The Contact Email of Your Service" required><br>
		Contact Number: <i>(Required Format: 0912 345 6789)</i>
		<input type="tel" name="contact" placeholder="The Contact Number of Your Service" pattern="^\d{4} \d{3} \d{4}$" required><br>
		Service Provider Name:
		<input type="text" name="spname" placeholder="The Name of Your Housekeeping Service" required><br>
		Proprietor First Name:
		<input type="text" name="firstname" placeholder="The Business Owner's First Name" required><br>
		Proprietor Last Name:
		<input type="text" name="lastname" placeholder="The Business Owner's Last Name" required><br>
		Business Address:
		<input type="text" name="addressline" placeholder="The Location Address of your Service" required><br>
		City:
		<select name="city" required>
			<option value=""></option>
			<option value="Angeles">Angeles</option>
			<option value="Antipolo">Antipolo</option>
			<option value="Bacolod">Bacolod</option>
			<option value="Bacoor">Bacoor</option>
			<option value="Baguio">Baguio</option>
			<option value="Batangas City">Batangas City</option>
			<option value="Biñan">Biñan</option>
			<option value="Butuan">Butuan</option>
			<option value="Cabanatuan">Cabanatuan</option>
			<option value="Cabuyao">Cabuyao</option>
			<option value="Cadiz">Cadiz</option>
			<option value="Cagayan de Oro">Cagayan de Oro</option>
			<option value="Calamba">Calamba</option>
			<option value="Calbayog">Calbayog</option>
			<option value="Caloocan">Caloocan</option>
			<option value="Carcar">Carcar</option>
			<option value="Cavite City">Cavite City</option>
			<option value="Cebu City">Cebu City</option>
			<option value="Cotabato City">Cotabato City</option>
			<option value="Dagupan">Dagupan</option>
			<option value="Danao">Danao</option>
			<option value="Dasmariñas">Dasmariñas</option>
			<option value="Davao City">Davao City</option>
			<option value="Digos">Digos</option>
			<option value="Dipolog">Dipolog</option>
			<option value="Dumaguete">Dumaguete</option>
			<option value="General Santos">General Santos</option>
			<option value="General Trias">General Trias</option>
			<option value="Ilagan">Ilagan</option>
			<option value="Iligan">Iligan</option>
			<option value="Iloilo City">Iloilo City</option>
			<option value="Imus">Imus</option>
			<option value="Kabankalan">Kabankalan</option>
			<option value="Kidapawan">Kidapawan</option>
			<option value="Koronadal">Koronadal</option>
			<option value="Lapu-Lapu">Lapu-Lapu</option>
			<option value="Las Piñas">Las Piñas</option>
			<option value="Legazpi">Legazpi</option>
			<option value="Lipa">Lipa</option>
			<option value="Lucena">Lucena</option>
			<option value="Mabalacat">Mabalacat</option>
			<option value="Makati">Makati</option>
			<option value="Malabon">Malabon</option>
			<option value="Malaybalay">Malaybalay</option>
			<option value="Malolos">Malolos</option>
			<option value="Mandaluyong">Mandaluyong</option>
			<option value="Mandaue">Mandaue</option>
			<option value="Manila">Manila</option>
			<option value="Marikina">Marikina</option>
			<option value="Meycauayan">Meycauayan</option>
			<option value="Muntinlupa">Muntinlupa</option>
			<option value="Naga">Naga</option>
			<option value="Navotas">Navotas</option>
			<option value="Olongapo">Olongapo</option>
			<option value="Ormoc">Ormoc</option>
			<option value="Pagadian">Pagadian</option>
			<option value="Panabo">Panabo</option>
			<option value="Parañaque">Parañaque</option>
			<option value="Pasay">Pasay</option>
			<option value="Pasig">Pasig</option>
			<option value="Puerto Prinsesa">Puerto Prinsesa</option>
			<option value="Quezon City">Quezon City</option>
			<option value="Roxas">Roxas</option>
			<option value="Samal">Samal</option>
			<option value="San Carlos">San Carlos</option>
			<option value="San Fernando">San Fernando</option>
			<option value="San Jose">San Jose</option>
			<option value="San Jose del Monte">San Jose del Monte</option>
			<option value="San Juan">San Juan</option>
			<option value="San Pablo">San Pablo</option>
			<option value="San Pedro">San Pedro</option>
			<option value="Santa Rosa">Santa Rosa</option>
			<option value="Sorsogon City">Sorsogon City</option>
			<option value="Surigao City">Surigao City</option>
			<option value="Tacloban">Tacloban</option>
			<option value="Taguig">Taguig</option>
			<option value="Tagum">Tagum</option>
			<option value="Talisay">Talisay</option>
			<option value="Tanauan">Tanauan</option>
			<option value="Tarlac City">Tarlac City</option>
			<option value="Toledo">Toledo</option>
			<option value="Valenzuela">Valenzuela</option>
			<option value="Vigan">Vigan</option>
			<option value="Zamboanga City">Zamboanga City</option>
		</select>
		<br>
		Province:
		<select name="province" required>
			<option value=""></option>
			<option value="Agusan del Norte">Agusan del Norte</option>
			<option value="Albay">Albay</option>
			<option value="Batangas">Batangas</option>
			<option value="Benguet">Benguet</option>
			<option value="Bukidnon">Bukidnon</option>
			<option value="Bulacan">Bulacan</option>
			<option value="Camarines Sur">Camarines Sur</option>
			<option value="Capiz">Capiz</option>
			<option value="Cavite">Cavite</option>
			<option value="Cebu">Cebu</option>
			<option value="Cotabato">Cotabato</option>
			<option value="Davao del Norte">Davao del Norte</option>
			<option value="Davao del Sur">Davao del Sur</option>
			<option value="Ilocos Sur">Ilocos Sur</option>
			<option value="Iloilo">Iloilo</option>
			<option value="Isabela">Isabela</option>
			<option value="La Union">La Union</option>
			<option value="Laguna">Laguna</option>
			<option value="Lanao del Norte">Lanao del Norte</option>
			<option value="Leyte">Leyte</option>
			<option value="Maguindanao">Maguindanao</option>
			<option value="Misamis Oriental">Misamis Oriental</option>
			<option value="NCR">NCR</option>
			<option value="Negros Occidental">Negros Occidental</option>
			<option value="Negros Oriental">Negros Oriental</option>
			<option value="Nueva Ecija">Nueva Ecija</option>
			<option value="Palawan">Palawan</option>
			<option value="Pampanga">Pampanga</option>
			<option value="Pangasinan">Pangasinan</option>
			<option value="Negros Occidental">Negros Occidental</option>
			<option value="Quezon">Quezon</option>
			<option value="Rizal">Rizal</option>
			<option value="Samar">Samar</option>
			<option value="Sorsogon">Sorsogon</option>
			<option value="South Cotabato">South Cotabato</option>
			<option value="Surigao del Norte">Surigao del Norte</option>
			<option value="Tarlac">Tarlac</option>
			<option value="Zambales">Zambales</option>
			<option value="Zamboanga del Norte">Zamboanga del Norte</option>
			<option value="Zamboanga del Sur">Zamboanga del Sur</option>
		</select>
		<br>
		Postal Code:
		<input type="text" name="postcode" placeholder="e.g. 2600" required><br>
		<input type="submit" name="submit" value="Submit">
	</form>

</body>

</html>