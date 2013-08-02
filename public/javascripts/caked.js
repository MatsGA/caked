twttr.events.bind('tweet', function(event) {
    window.location = "/tweeted";
});

$('.carousel').carousel({
    interval: 5000
});

$('body').scrollspy();

