$(document).ready(function() {
    $('#filter_input').bind('input', function() {
        var text = $(this).val();
        $.get( "products_list.jsp?lang=" + window.lang + "&query=" + text, function( data ) {
            $( "#products-list" ).html( data );
        });
    });
} );