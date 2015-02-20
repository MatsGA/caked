twttr.events.bind('tweet', function(event) {
    window.location = "/tweeted";
});

$('.carousel').carousel({
    interval: false
});

$('body').scrollspy();

