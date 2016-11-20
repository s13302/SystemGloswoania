/**
 * Created by rpi on 20.11.16.
 */
/**
 * Created by rpi on 19.11.16.
 */
angular.module('glosowanie').controller('userCtrl', function (User, $location) {

    User.loggedUser(function(data) {
        if (data.id !== undefined) {
            var authority = data.authorities[0].authority;
            console.log(authority);
            if (authority == 'ROLE_ADMIN') {
                console.log("admin");
                $location.url('/admin');
            } else {
                console.log("user");
                $location.url('/selectSession');
            }
        }
    });

});
