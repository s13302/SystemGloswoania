/**
 * Created by rpi on 20.11.16.
 */
/**
 * Created by rpi on 19.11.16.
 */
angular.module('glosowanie').controller('adminSessionCtrl', function (Session, $scope) {

    Session.query(function (result) {
        $scope.sessions = result;
    });

});
