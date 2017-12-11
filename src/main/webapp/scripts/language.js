function changeLanguage(lang) {
    $.get( "/language?lang=" + lang, function( data ) {
        location.reload(true);
    });
}