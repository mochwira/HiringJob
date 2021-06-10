$(document).ready(function() {
    $('#activeSchedule').val('true');
});


// function editSchedule(param) {
//     console.log(param);
//     var idSchedule = $('#idScheduleText' + param).text();
//     var nameSchedule = $('#nameScheduleText' + param).text();
//     var startSchedule = $('#startScheduleText' + param).text();
//     var endSchedule = $('#endScheduleText' + param).text();
//     var activeSchedule = $('#activeScheduleText' + param).text();

//     $('.idScheduleEdit').val(idSchedule);
//     $('.nameScheduleEdit').val(nameSchedule);
//     $('.startScheduleEdit').val(startSchedule);
//     $('.endScheduleEdit').val(endSchedule);
//     $('.activeScheduleEdit').val('true');
//     $('#edit-row-form').attr("action", "/schedule/edit/" + idSchedule);
//     $('#editSchedule').modal('toggle');
// }

// function removeSchedule(param) {
//     var idSchedule = $('#idScheduleText' + param).text();
//     var nameSchedule = $('#nameScheduleText' + param).text();
//     var startSchedule = $('#startScheduleText' + param).text();
//     var endSchedule = $('#endScheduleText' + param).text();
//     var activeSchedule = $('#activeScheduleText' + param).text();
//     //console.log(idRole);
//     $('.idScheduleRemove').val(idSchedule);
//     $('.nameScheduleRemove').val(nameSchedule);
//     $('.startScheduleRemove').val(startSchedule);
//     $('.endScheduleRemove').val(endSchedule);
//     $('.activeScheduleRemove').val('false');
//     $('.nameScheduleRemoveText').text(nameSchedule);
//     $('#remove-row-form').attr("action", "/schedule/edit/" + idSchedule);
//     $('#removeRole').modal('toggle');
// }


$(document).ready(function(){
    $("button.edit_record").click(function(event) {
        var idSchedule = event.target.id;

        var nameSchedule = $('#nameScheduleText' + idSchedule).text();
        var startSchedule = $('#startScheduleText' + idSchedule).text();
        var endScheduleRaw = $('#endScheduleText' + idSchedule).text();

        var startSchedule = startSchedule.substring(0, 5);
        var endSchedule = endScheduleRaw.substring(0, 5);

        $('.idScheduleEdit').val(idSchedule);
        $('.nameScheduleEdit').val(nameSchedule);
        $('.startScheduleEdit').val(startSchedule);
        $('.endScheduleEdit').val(endSchedule);
        $('.activeScheduleEdit ').val('true');

        $('.nameUserRemoveText').text(name);
        $('.idScheduleRemove').val(idSchedule);
        $('#edit-row-form').attr("action", "/schedule/edit/" + idSchedule);
        $('#editSchedule').modal('toggle');
    });

    $("button.remove_record").click(function(event) {
        var idSchedule = event.target.id;
        var nameSchedule = $('#nameScheduleText' + idSchedule).text();
        var startScheduleRaw = $('#startScheduleText' + idSchedule).text();
        var endScheduleRaw = $('#endScheduleText' + idSchedule).text();
        var activeSchedule = $('#activeScheduleText' + idSchedule).text();
        var startSchedule = startScheduleRaw.substring(0, 5);
        var endSchedule = endScheduleRaw.substring(0, 5);
        $('.idScheduleRemove').val(idSchedule);
        $('.nameScheduleRemove').val(nameSchedule);
        $('.startScheduleRemove').val(startSchedule);
        $('.endScheduleRemove').val(endSchedule);
        $('.activeScheduleRemove').val('false');
        $('.nameScheduleRemoveText').text(nameSchedule);

        $('#remove-row-form').attr("action", "/schedule/edit/" + idSchedule);
        $('#removeSchedule').modal('toggle');
    });

    $('#activeSchedule').val('true');


    // $('.clockpicker').clockpicker({
    //     placement: 'top',
    //     align: 'left',
    //     donetext: 'Done'
    // });
});

