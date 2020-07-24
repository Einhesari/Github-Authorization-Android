package com.mydigipay.challenge.presentation.model

data class UserItem(
    var login: String? = null,
    var id: String? = null,
    var nodeId: String? = null,
    var avatarUrl: String? = null,
    var gravatarId: String? = null,
    var url: String? = null,
    var htmlUrl: String? = null,
    var followersUrl: String? = null,
    var followingUrl: String? = null,
    var gistsUrl: String? = null,
    var starredUrl: String? = null,
    var subscriptionsUrl: String? = null,
    var organizationsUrl: String? = null,
    var reposUrl: String? = null,
    var eventsUrl: String? = null,
    var receivedEventsUrl: String? = null,
    var type: String? = null,
    var site_admin: Boolean? = false,
    var name: String? = null,
    var company: String? = null,
    var blog: String? = null,
    var location: String? = null,
    var email: String? = null,
    var hireable: Boolean? = false,
    var bio: String? = null,
    var twitterUsername: String? = null,
    var publicRepos: String? = null,
    var publicGists: String? = null,
    var followers: String? = null,
    var following: String? = null,
    var createdAt: String? = null,
    var updatedAt: String? = null
)