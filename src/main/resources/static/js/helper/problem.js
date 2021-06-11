$(document).ready(function() {
    $('#activeProblem').val('true');
});


function editProblem(param) {
    var idProblem = $('#idProblemText' + param).text();
    var nameProblem = $('#nameProblemText' + param).text();
    $('.idProblemEdit').val(idProblem);
    $('.nameProblemEdit').val(nameProblem);
    $('.activeProblemEdit').val('true');
    $('#edit-row-form').attr("action", "/problem/edit/" + idProblem);
    $('#editProblem').modal('toggle');
}

function removeProblem(param) {
    var idProblem = $('#idProblemText' + param).text();
    var nameProblem = $('#nameProblemText' + param).text();
    console.log(idProblem);
    $('.idProblemRemove').val(idProblem);
    $('.nameProblemRemove').val(nameProblem);
    $('.activeProblemRemove').val('false');
    $('.nameProblemRemoveText').text(nameProblem);
    $('#remove-row-form').attr("action", "/problem/edit/" + idProblem);
    $('#removeProblem').modal('toggle');
}