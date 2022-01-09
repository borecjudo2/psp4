<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading">Add sold phone</div>
                <div class="panel-body">
                    <form:form method="post" modelAttribute="phone">
                        <form:hidden path="id" />
                        <fieldset class="form-group">
                            <form:label path="company">company</form:label>
                            <form:input path="company" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="company" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="model">model</form:label>
                            <form:input path="model" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="model" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="soldCost">soldCost</form:label>
                            <form:input path="soldCost" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="soldCost" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="soldDate">soldDate dd.MM.yyyy</form:label>
                            <form:input path="soldDate" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="soldDate" cssClass="text-warning" />
                        </fieldset>

                        <button type="submit" class="btn btn-success">Save</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="common/footer.jspf"%>