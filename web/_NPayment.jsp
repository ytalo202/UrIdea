<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="paym" method="post">


    <p>id_companies<input type="text" name="id_companies" /></p>
    <p>id_payment_type<input type="text" name="id_payment_type" /></p>
    <p>card_number<input type="text" name="card_number" /></p>
    <p>name<input type="text" name="name"/></p>
    <p>last_name<input type="text" name="last_name" /></p>
    <p>first_address<input type="text" name="first_address" /></p>
    <p>second_address<input type="text" name="second_address" /></p>
    <p>payment_date<input type="text" name="payment_date" /></p>
    <p>location<input type="text" name="location" /></p>
    <p>country<input type="text" name="country" /></p>
    <p>code_zip<input type="text" name="code_zip" /></p>
    <p>cell_phone_number<input type="text" name="cell_phone_number" /></p>
    <p>payment_amount<input type="text" name="payment_amount" /></p>
    <p>expiry_month<input type="text" name="expiry_month" /></p>
    <p>expiry_day<input type="text" name="expiry_day" /></p>
    <p>security_code<input type="text" name="security_code" /></p>

    <input type="hidden" value="create" name="action"/>
    <input type="submit"/>
</form>