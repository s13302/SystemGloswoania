/**
 * Created by rpi on 19.11.16.
 */
angular.module('glosowanie').controller('sessionCtrl', function (Session, $routeParams, $scope) {

    var qrCode = $routeParams.qr;
    Session.get({
        qr: qrCode
    }, function (data) {
        $scope.session = data;
    })

});
