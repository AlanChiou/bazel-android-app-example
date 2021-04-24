# https://docs.bazel.build/versions/master/be/android.html#android_sdk_repository
android_sdk_repository(
  name = "androidsdk",
  api_level = 30,
  build_tools_version = "30.0.3"
)

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# Kotlin
# https://github.com/bazelbuild/rules_kotlin
rules_kotlin_version = "v1.5.0-alpha-3"
rules_kotlin_sha = "eeae65f973b70896e474c57aa7681e444d7a5446d9ec0a59bb88c59fc263ff62"
http_archive(
  name = "io_bazel_rules_kotlin",
  urls = ["https://github.com/bazelbuild/rules_kotlin/releases/download/%s/rules_kotlin_release.tgz" % rules_kotlin_version],
  sha256 = rules_kotlin_sha,
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")
kotlin_repositories() # if you want the default.
kt_register_toolchains() # to use the default toolchain.

# Third party libraries
# https://github.com/bazelbuild/rules_jvm_external
RULES_JVM_EXTERNAL_TAG = "4.0"
RULES_JVM_EXTERNAL_SHA = "31701ad93dbfe544d597dbe62c9a1fdd76d81d8a9150c2bf1ecf928ecdf97169"
http_archive(
  name = "rules_jvm_external",
  strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
  sha256 = RULES_JVM_EXTERNAL_SHA,
  url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

lifecycle_version = "2.3.1"
retrofit_version = "2.9.0"
maven_install(
  artifacts = [
      "androidx.appcompat:appcompat:1.2.0",
      "androidx.annotation:annotation:1.1.0",
      "androidx.lifecycle:lifecycle-viewmodel-ktx:%s" % lifecycle_version,
      "androidx.lifecycle:lifecycle-livedata-ktx:%s" % lifecycle_version,
      "androidx.lifecycle:lifecycle-common-java8:%s" % lifecycle_version,
      "com.google.code.gson:gson:2.8.6",
      "com.squareup.retrofit2:retrofit:%s" % retrofit_version,
      "com.squareup.retrofit2:converter-gson:%s" % retrofit_version,
  ],
  repositories = [
    "https://maven.google.com", # google()
    "https://repo1.maven.org/maven2", # mavenCentral
  ],
)