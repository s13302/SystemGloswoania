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
            if (authority == 'ROLE_ADMIN') {
                $location.url('/admin');
            } else {
                $location.url('/selectSession');
            }
        }
    });

});
