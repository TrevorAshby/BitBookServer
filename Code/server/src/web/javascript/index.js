var currentUser = null;

// the issue doing it this way, is that when the page 
//is reloaded, the user will be cleared. Need to store? 
function loadPage() {
    if (currentUser == null) {
        document.getElementById('loginDiv').hidden = false;
        document.getElementById('logoutDiv').hidden = true;
    }
    else {
        document.getElementById('loginDiv').hidden = true;
        document.getElementById('welcomeUser').textContent = "Welcome, " + currentUser;
        document.getElementById('logoutDiv').hidden = false;
    }
}

function testLoad() {
    loadPage();
    console.log("Loaded Page");
}

function testLogin() {
    currentUser = "test123";
    loadPage();
}

function logout() {
    currentUser = null;
    loadPage();
}

function login() {
    document.getElementById("registerCol").hidden = true;
    document.getElementById("loginCol").hidden = false;
    //username
    //password
}

function register() {
    document.getElementById("loginCol").hidden = true;
    document.getElementById("registerCol").hidden = false;
    //username
    //password
    //confirmedPassword
    //email
    //first name
    //last name
    //DOB
    //picture
}