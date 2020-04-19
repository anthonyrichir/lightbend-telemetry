resolvers in ThisBuild += "lightbend-commercial-mvn" at
  "https://repo.lightbend.com/pass/qNrXga5O3HxihdYZ-E0QZU8CNdxpbMID_BbzhXkIa_m3X1vc/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
  url("https://repo.lightbend.com/pass/qNrXga5O3HxihdYZ-E0QZU8CNdxpbMID_BbzhXkIa_m3X1vc/commercial-releases"))(Resolver.ivyStylePatterns)