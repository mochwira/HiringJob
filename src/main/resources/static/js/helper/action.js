$(document).ready(function() {
    $('#activeAction').val('true');
});


function editAction(param) {
    console.log(param);
    var idAction = $('#idActionText' + param).text();
    var nameAction = $('#nameActionText' + param).text();
    var activeAction = $('#activeActionText' + param).text();

    $('.idActionEdit').val(idAction);
    $('.nameActionEdit').val(nameAction);
    $('.activeActionEdit').val('true');
    $('#edit-row-form').attr("action", "/action/edit/" + idAction);
    $('#editAction').modal('toggle');
}

function removeAction(param) {
    var idAction = $('#idActionText' + param).text();
    var nameAction = $('#nameActionText' + param).text();
    console.log(idAction);
    $('.idActionRemove').val(idAction);
    $('.nameActionRemove').val(nameAction);
    $('.activeActionRemove').val('false');
    $('.nameActionRemoveText').text(nameAction);
    $('#remove-row-form').attr("action", "/action/edit/" + idAction);
    $('#removeAction').modal('toggle');
}


$(document).ready(function() {
    $('#activeAction').val('true');
});