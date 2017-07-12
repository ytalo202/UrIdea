<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--

--%>
<jsp:useBean id="service" class="dbUrIdea.services.HRService"/>

<form action="paym" method="post">

    <input type="text" name="id" value="${payment.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }" />
    />
    <input type="text" name="id_companies"  value="${payment.company.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }" />
    />
    <input type="text" name="id_payment_type" value="${payment.paymentsType.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }" />
    />
    <input type="text" name="card_number"  value="${payment.cardNumber}"/>
    <input type="text" name="name" value="${payment.name}"/>
    <input type="text" name="last_name" value="${payment.lastName}"/>
    <input type="text" name="first_address" value="${payment.firstAddress}"/>
    <input type="text" name="second_address"  value="${payment.secondAddress}"/>
    <input type="text" name="payment_date"  value="${payment.paymentDate}"/>
    <input type="text" name="location" value="${payment.location}"/>
    <input type="text" name="country" value="${payment.country}"/>
    <input type="text" name="code_zip" value="${payment.codeZip}"/>
    <input type="text" name="cell_phone_number" value="${payment.cellPhoneNumber}"/>
    <input type="text" name="payment_amount" value="${payment.amount}"/>
    <input type="text" name="expiry_month" value="${payment.expiryMonth}"/>
    <input type="text" name="expiry_day" value="${payment.expiryDay}"/>
    <input type="text" name="security_code" value="${payment.securityCode}"/>

    <input type="hidden" value="update" name="action"/>
    <input type="submit"/>
</form>