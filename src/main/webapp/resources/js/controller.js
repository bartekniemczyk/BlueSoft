/**
 * Created by Bartek on 29.05.2017.
 */
var cartApp = angular.module('cartApp', []);
cartApp.controller('cartCtrl', function ($scope, $http) {

    $scope.refreshCart = function () {
        $http({
            method: "GET",
            url: "http://localhost:8083/deals/all"
        });
    }

    $scope.remove = function (dealId) {
        $http({
            method:"PUT",
            url:"http://localhost:8083/rest/remove/"+dealId
        }).then(function () {
            $scope.refreshCart();
            alert("usunięto");
        },function () {
            alert("nie da sie usunąc");
        });
    };

});