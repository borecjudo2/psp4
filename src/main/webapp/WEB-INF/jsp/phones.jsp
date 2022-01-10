<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md" href="/add">Add sold phone </a>
    </div>
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>List of sold phones</h3>
        </div>
        <div class="panel-body">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th data-column="id" data-order="desc" width="18%">Id</th>
                    <th data-column="company" data-order="desc" width="18%">company</th>
                    <th data-column="model" data-order="desc" width="18%">model</th>
                    <th data-column="soldCost" data-order="desc" width="18%">soldCost</th>
                    <th data-column="soldDate" data-order="desc" width="18%">soldDate</th>
                    <th width="10%"></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${phones}" var="phone">
                    <tr>
                        <td onclick="$">${phone.id}</td>
                        <td>${phone.company}</td>
                        <td>${phone.model}</td>
                        <td>${phone.soldCost}</td>
                        <td>${phone.soldDate}</td>
                        <td><a type="button" class="btn btn-success"
                               href="/update?id=${phone.id}">Update</a>
                            <a type="button" class="btn btn-warning"
                               href="/delete?id=${phone.id}">Delete</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>

<script>
    $('th').on('click', function (){
        var column = $(this).data('column')
        var order = $(this).data('order')
        console.log('Column clicked', column, order)

        var xhr = new XMLHttpRequest();
        xhr.open('GET', '/sort?column=' + column +'&order=' + order, true);
        xhr.send()
    })
</script>