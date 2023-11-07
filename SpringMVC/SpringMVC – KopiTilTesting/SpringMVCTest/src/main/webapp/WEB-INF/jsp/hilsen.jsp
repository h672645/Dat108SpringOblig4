<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1>Hei, tast inn informasjon om deltageren:</h1>
	<form:form action="registrer" method="post" modelAttribute="deltager">
		<form:label path="fornavn">fornavn</form:label>
		<form:input path="fornavn"/><br>
		<form:label path="etternavn">etternavn</form:label>
		<form:input path="etternavn"/><br>
		<form:label path="mobil" type="number">mobil</form:label>
		<form:input path="mobil"/><br>
		<form:label path="passord">passord</form:label>
		<form:input path="passord"/><br>
		<form:label path="kjonn">kjonn</form:label>
		<form:input path="kjonn"/><br>
		<input type="submit" value="Lagre"/>
	</form:form>
</body>
</html>