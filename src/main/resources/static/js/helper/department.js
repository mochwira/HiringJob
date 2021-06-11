$(document).ready(function() {
    $('#activeDepartment').val('true');
});


function editDepartment(param) {
    console.log(param);
    var idDepartment = $('#idDepartmentText' + param).text();
    var nameDepartment = $('#nameDepartmentText' + param).text();
    var activeDepartment = $('#activeDepartmentText' + param).text();

    $('.idDepartmentEdit').val(idDepartment);
    $('.nameDepartmentEdit').val(nameDepartment);
    $('.activeDepartmentEdit').val('true');
    $('#edit-row-form').attr("action", "/department/edit/" + idDepartment);
    $('#editDepartment').modal('toggle');
}

function removeDepartment(param) {
    var idDepartment = $('#idDepartmentText'+param).text();
    var nameDepartment = $('#nameDepartmentText'+param).text();
    console.log(idDepartment);
    $('.idDepartmentRemove').val(idDepartment);
    $('.nameDepartmentRemove').val(nameDepartment);
    $('.activeDepartmentRemove').val('false');
    $('.nameDepartmentRemoveText').text(nameDepartment);
    $('#remove-row-form').attr("action", "/department/edit/"+idDepartment);
    $('#removeDepartment').modal('toggle');
}


$(document).ready(function() {
    $('#activeDepartment').val('true');
});

$(document).ready(function() {

    $('.userinfo').click(function() {

        var userid = $(this).data('id');

        // AJAX request
        $.ajax({
            url: '/department/',
            type: 'post',
            data: { userid: userid },
            success: function(response) {
                // Add response in Modal body
                $('.modal-header').html(response);

                // Display Modal
                $('#editDepartment').modal('show');
            }
        });
    });
});