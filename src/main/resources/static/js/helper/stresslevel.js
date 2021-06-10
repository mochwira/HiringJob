$(document).ready(function() {
    $('#activeStressLevel').val('true');
});


function editStressLevel(param) {
    console.log(param);
    var idStressLevel = $('#idStressLevelText' + param).text();
    var nameStressLevel = $('#nameStressLevelText' + param).text();
    var activeStressLevel = $('#activeStressLevelText' + param).text();

    $('.idStressLevelEdit').val(idStressLevel);
    $('.nameStressLevelEdit').val(nameStressLevel);
    $('.activeStressLevelEdit').val('true');
    $('#edit-row-form').attr("action", "/stresslevel/edit/" + idStressLevel);
    $('#editStressLevel').modal('toggle');
    console.log('VALUE : ' + nameStressLevel);
}

function removeStressLevel(param) {
    var idStressLevel = $('#idStressLevelText' + param).text();
    var nameStressLevel = $('#nameStressLevelText' + param).text();
    console.log(idStressLevel);
    $('.idStressLevelRemove').val(idStressLevel);
    $('.nameStressLevelRemove').val(nameStressLevel);
    $('.activeStressLevelRemove').val('false');
    $('.nameStressLevelRemoveText').text(nameStressLevel);
    $('#remove-row-form').attr("action", "/stresslevel/edit/" + idStressLevel);
    $('#removeStressLevel').modal('toggle');
}


$(document).ready(function() {
    $('#activeStressLevel').val('true');
});

// $(document).ready(function() {

//     $('.userinfo').click(function() {

//         var userid = $(this).data('id');

//         // AJAX request
//         $.ajax({
//             url: '/department/',
//             type: 'post',
//             data: { userid: userid },
//             success: function(response) {
//                 // Add response in Modal body
//                 $('.modal-header').html(response);

//                 // Display Modal
//                 $('#editDepartment').modal('show');
//             }
//         });
//     });
// });