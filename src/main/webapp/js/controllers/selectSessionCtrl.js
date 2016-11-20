/**
 * Created by rpi on 19.11.16.
 */
angular.module('glosowanie').controller('selectSessionCtrl', function (Session, $scope, $location) {

    $scope.submit = function () {
        var sessionId = $scope.sessionId;
        Session.get({
            qr: sessionId
        }, function(data) {
            if (data.id !== undefined) {
                $location.url('/session/' + data.qr);
            }
        });
    };

});
