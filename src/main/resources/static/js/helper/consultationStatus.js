$(document).ready(function() {
    $('#activeConsultationStatus').val('true');
});


function editConsultationStatus(param) {
    console.log(param);
    var idConsultationStatus = $('#idConsultationStatusText' + param).text();
    var nameConsultationStatus = $('#nameConsultationStatusText' + param).text();
    var activeConsultationStatus = $('#activeConsultationStatusText' + param).text();

    $('.idConsultationStatusEdit').val(idConsultationStatus);
    $('.nameConsultationStatusEdit').val(nameConsultationStatus);
    $('.activeConsultationStatusEdit').val('true');
    $('#edit-row-form').attr("consultationstatus", "/consultationstatus/edit/" + idConsultationStatus);
    $('#editConsultationStatus').modal('toggle');
}

function removeConsultationStatus(param) {
    var idConsultationStatus = $('#idConsultationStatusText' + param).text();
    var nameConsultationStatus = $('#nameConsultationStatusText' + param).text();
    console.log(idConsultationStatus);
    $('.idConsultationStatusRemove').val(idConsultationStatus);
    $('.nameConsultationStatusRemove').val(nameConsultationStatus);
    $('.activeConsultationStatusRemove').val('false');
    $('.nameConsultationStatusRemoveText').text(nameConsultationStatus);
    $('#remove-row-form').attr("consultationstatus", "/consultationstatus/edit/" + idConsultationStatus);
    $('#removeConsultationStatus').modal('toggle');
}


$(document).ready(function() {
    $('#activeConsultationStatus').val('true');
});